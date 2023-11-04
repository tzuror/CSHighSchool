"""EX 2.6 protocol implementation
   Author:
   Date:
"""

LENGTH_FIELD_SIZE = 2
PORT = 8820


def check_cmd(data):
    """Check if the command is defined in the protocol (e.g RAND, NAME, TIME, EXIT)"""
    try:
        if  data in ["RAND", "NAME", "TIME", "EXIT"]:
            return True
    except:
        return False
    return False


def create_msg(data):
    """Create a valid protocol message, with length field"""
    length = str(len(data))
    filledLength = length.zfill(LENGTH_FIELD_SIZE)
    return filledLength + data


def get_msg(my_socket):
    """Extract message from protocol, without the length field
       If length field does not include a number, returns False, "Error" """
    
    Massage = my_socket.recv(101).decode()
    try:
        lenSeg = int(Massage[0:2])
        dataSeg = Massage[2:]
    except:
        return False, "Error"
    if int(lenSeg) == len(dataSeg):
        return True, dataSeg
    else:
        return False, Massage
