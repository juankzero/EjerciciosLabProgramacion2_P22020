/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author Juan Carlos Zepeda
 */

enum FileType
{
    systemFile,
    directory,
    file,
    blank
}

public class FileEntry {
    
    protected String name;
    protected int size;
    protected FileType type;

    
    public FileEntry() {
        
        this.name = "UNKNOWN";
        this.type = FileType.blank;
        this.size = 0;
    }
    
    public FileEntry(String _name, int _size)
    {
        this.name = _name;
        this.size = _size;
        this.type = FileType.blank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    
    public FileType getType() {
        return type;
    }
    
}
