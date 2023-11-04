#   Ex. 2.7 template - server side
#   Author: Barak Gonen, 2017
#   Modified for Python 3, 2020

import socket
import protocol
import os
import subprocess
import glob
import shutil
import pyautogui

IP = "0.0.0.0"
PHOTO_PATH = r"C:\Users\ort\Pictures\Screenshots\screen.jpg" # The path + filename where the screenshot at the server should be saved


def check_client_request(cmd):
    """
    Break cmd to command and parameters
    Check if the command and params are good.

    For example, the filename to be copied actually exists

    Returns:
        valid: True/False
        command: The requested cmd (ex. "DIR")
        params: List of the cmd params (ex. ["c:\\cyber"])
    """
    # Use protocol.check_cmd first\
    # (3)
    valid_protocol = protocol.check_cmd(cmd)
    if valid_protocol:
        if cmd == "TAKE_SCREENSHOT":
            return True, "TAKE_SCREENSHOT", []
        if cmd[:4] == "COPY":
            cmd, fromFile, toFile = cmd.split(' ', 2)
        else:
            cmd, params = cmd.split(' ', 1)
        if cmd == "DIR":
            if os.path.isdir(params):
                return True, "DIR", [params]
            else:
                return False, "DIR", [params]
        elif cmd == "DELETE":
            if os.path.isfile(params):
                return True, cmd, [params]
            else:
                return False, cmd, [params]
        elif cmd == "COPY":
            if os.path.isfile(fromFile):
                return True, cmd, [fromFile, toFile]
            else:
                return False, cmd, [fromFile, toFile]
        elif cmd == "EXECUTE":
            if os.path.isfile(params) and params.endswith(".exe"):
                return True, cmd, [params]
            else:
                return False, cmd, [params]
    return False, cmd, [None]
            
        


    # Then make sure the params are valid

    # (6)

    return True, "DIR", ["c:\\cyber"]


def handle_client_request(command, params):
    """Create the response to the client, given the command is legal and params are OK

    For example, return the list of filenames in a directory
    Note: in case of SEND_PHOTO, only the length of the file will be sent

    Returns:
        response: the requested data

    """
    response = ''
    if command == 'TAKE_SCREENSHOT':
        image = pyautogui.screenshot()
        image.save(PHOTO_PATH)
        response = os.path.getsize(PHOTO_PATH)
    elif command == 'DIR':
        filesList = glob.glob(params[0] + "\\*.*")
        response = ';'.join(filesList)
    elif command == 'DELETE':
        os.remove(params[0])
        response = 'OK DELETE'
    elif command == 'COPY':
        shutil.copy(params[0], params[1])
        response = 'OK COPY'
    elif command == 'EXECUTE':
        subprocess.call(params[0])
        response = 'OK EXECUTE'
    return response


def main():
    # open socket with client
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind((IP, protocol.PORT))
    server_socket.listen()
    print("Server is up and running")
    while True:
        (client_socket, client_address) = server_socket.accept()
        print("Client connected")
        # (1)

        # handle requests until user asks to exit
        while True:
            # Check if protocol is OK, e.g. length field OK
            valid_protocol, cmd = protocol.get_msg(client_socket)
            if valid_protocol:
                # Check if params are good, e.g. correct number of params, file name exists
                valid_cmd, command, params = check_client_request(cmd)
                if valid_cmd:

                    # (6)

                    # prepare a response using "handle_client_request"

                    # add length field using "create_msg"

                    # send to client
                    response = handle_client_request(command, params)
                    response = protocol.create_msg(response)
                    client_socket.send(response.encode())   

                    if command == 'TAKE_SCREENSHOT':
                        # Send the data itself to the clien
                        myfile = open(PHOTO_PATH, 'rb')
                        bytes = myfile.read()
                        client_socket.sendall(bytes)
                        myfile.close()
                        # (9)
                    
                    if command == 'EXIT':
                        break
                else:
                    # prepare proper error to client
                    response = 'Bad command or parameters'
                    # send to client

            else:
                # prepare proper error to client
                response = 'Packet not according to protocol'
                #send to client

                # Attempt to clean garbage from socket
                client_socket.recv(1024)

        # close sockets
        print("Closing connection")


if __name__ == '__main__':
    main()
