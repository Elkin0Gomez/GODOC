package com.mycompany.proyectosemestre;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.io.FileOutputStream;
import java.io.IOException;


public class LeerDocumento {
            
       /* String nombre;
        String apellido;
        String documento;
        
        FileOutputStream archivo;

    public LeerDocumento(String nombre, String Apellido, String Documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        
    }*/

    public void Leer (){

        try {
            //archivo = new FileOutputStream(nombre + ".pdf");
           // PdfWriter.getInstance(document, archivo)
           // documento.open();
            
            String filename = "C:/Contratos/minutaTrabajo.pdf";
            
            PdfReader pdf = new PdfReader(filename);
            int pages = pdf.getNumberOfPages();
            for (int i=1;i<=pages;i++){
                String content = PdfTextExtractor.getTextFromPage(pdf, i);
                System.out.println(content);
        }
            
        } catch (IOException e) {
            
        }
    }
}

