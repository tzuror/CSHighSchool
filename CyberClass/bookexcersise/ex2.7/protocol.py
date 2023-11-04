#   Ex. 2.7 template - protocol


LENGTH_FIELD_SIZE = 4
PORT = 8820


def check_cmd(data):
    """
    Check if the command is defined in the protocol, including all parameters
    For example, DELETE c:\work\file.txt is good, but DELETE alone is not
    """
    if data == "TAKE_SCREENSHOT":
        return True
    try:
        cmd, params = data.split(' ', 1)
        if cmd not in ['TAKE_SCREENSHOT', 'DIR', 'DELETE', 'COPY', 'EXECUTE', 'EXIT']:
            return False
        if params == '':
            return False
        return True
    except:
        return False


def create_msg(data):
    """
    Create a valid protocol message, with length field
    """
    length = str(len(data))
    filledLength = length.zfill(LENGTH_FIELD_SIZE)
    return filledLength + data

    # (4)
    return "0002OK".encode()


def get_msg(my_socket):
    """
    Extract message from protocol, without the length field
    If length field does not include a number, returns False, "Error"
    """
    Massage = my_socket.recv(1024).decode()
    try:
        lenSeg = int(Massage[0:2])
        dataSeg = Massage[2:]
    except:
        return False, "Error"
    if int(lenSeg) == len(dataSeg):
        return True, dataSeg
    else:
        return False, Massage

    # (5)
    return True, "OK"


