# Log File Change Directory

import os
import shutil

# Filed

source = r'C:\test'
destination = r'C:\test\logs'
files = os.listdir(source)

def get_files_count(folder_path):
    dirList = os.listdir(folder_path)
    return len(dirList)

if get_files_count :
    for file in files:
        new_path = shutil.move(f"{source}/{file}", destination)
        print("Moved File Path : %s " % new_path)
    
    
