# Log File Change Directory

import os
import shutil

# Filed

source = r'C:\tibco\tsnm\logs'
destination = r'C:\tibco\logs'
files = os.listdir(source)

def get_files_count(folder_path):
    dirList = os.listdir(folder_path)
    return len(dirList)

if __name__=="__main__":
    print(get_files_count("."))
    
    
if get_files_count > 1:
    for file in files:
        new_path = shutil.move(f"{source}/{file}", destination)
        print(new_path)
    
    
