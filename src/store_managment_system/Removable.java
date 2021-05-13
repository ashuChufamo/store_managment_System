/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_managment_system;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author user
 */
public interface Removable {
    public void remove(String id,String path,int sheetIndex)throws IOException,FileNotFoundException;
    
}
