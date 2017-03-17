/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alessandro;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author adgri_001
 */
public class administrarHadas {
    private ArrayList<Hadas> listaHadas = new ArrayList();
    private File archivo = null;
    
    public administrarHadas(String path) {
        archivo = new File(path);
    }

    public administrarHadas() {
    }

    public ArrayList<Hadas> getListaHadas() {
        return listaHadas;
    }

    public void setListaHadas(ArrayList<Hadas> listaHadas) {
        this.listaHadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setHada(Hadas t){
        listaHadas.add(t);
    }
    public void cargarArchivo() throws FileNotFoundException, IOException, ClassNotFoundException{
        listaHadas = new ArrayList();
        Hadas temp;
        if(archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try{
                
                while((temp=(Hadas)objeto.readObject())!=null){
                    listaHadas.add(temp);
                    
                }
            }catch(EOFException e){
                //encontro el final del archivo
            }
            objeto.close();
            entrada.close();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas t : listaHadas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception ex){
                
            }
    
}
    }
}

