import glob
params = [r"C:\Users\ort\Desktop\ComputerSience\CSHighSchool\CyberClass\bookexcersise\ex2.7"]
filesList = glob.glob(params[0] + "\\*.*")
print(filesList)