#   Ex. 2.7 template - client side
#   Author: Barak Gonen, 2017
#   Modified for Python 3, 2020


import socket
import protocol


IP = "10.100.102.80"
SAVED_PHOTO_LOCATION = r"C:\Users\ortzu\Pictures\Screenshots\screen.jpg" # The path + filename where the copy of the screenshot at the client should be saved

def handle_server_response(my_socket, cmd):
    """
    Receive the response from the server and handle it, according to the request
    For example, DIR should result in printing the contents to the screen,
    Note- special attention should be given to SEND_PHOTO as it requires and extra receive
    """
    
    # (8) treat all responses except SEND_PHOTO
    valid, respose = protocol.get_msg(my_socket)
    #print(valid, respose)
    if valid:
        if cmd[0:3] == "DIR":
            print(respose.split(';'))
        elif cmd[0:6] == "DELETE":
            print(respose)
        elif cmd[0:4] == "COPY":
            print(respose)
        elif cmd[0:7] == "EXECUTE":
            print(respose)
        elif cmd == 'TAKE_SCREENSHOT':
            Photo = my_socket.recv(int(respose))
            with open(SAVED_PHOTO_LOCATION, 'wb') as f:
                f.write(Photo)
            print("Screenshot saved at: " + SAVED_PHOTO_LOCATION)

    # (10) treat SEND_PHOTO


def main():
    my_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    my_socket.connect((IP, protocol.PORT))
    # open socket with the server

    # (2)

    # print instructions
    print('Welcome to remote computer application. Available commands are:\n')
    print('TAKE_SCREENSHOT\nSEND_PHOTO\nDIR\nDELETE\nCOPY\nEXECUTE\nEXIT')

    # loop until user requested to exit
    while True:
        cmd = input("Please enter command:\n")
        if protocol.check_cmd(cmd):
            packet = protocol.create_msg(cmd)
            my_socket.send(packet.encode())
            handle_server_response(my_socket, cmd)
            if cmd == 'EXIT':
                break
        else:
            print("Not a valid command, or missing parameters\n")

    my_socket.close()

if __name__ == '__main__':
    main()