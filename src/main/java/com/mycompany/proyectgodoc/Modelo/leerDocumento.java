package com.mycompany.proyectosemestre;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LeerDocumento {
            


    public void Leer (){

        try {
            String filename = "C:/Contratos/ContratoNRC.pdf";
            
            PdfReader pdf = new PdfReader(filename);
            PdfStamper pdfStamper = new PdfStamper(pdf, new FileOutputStream("C:/Contratos/minutaTrabajoNuevo.pdf"));
            int pages = pdf.getNumberOfPages();
            for (int i=1;i<=pages;i++){
                
                PdfContentByte content = pdfStamper.getUnderContent(i);
               
                //String content = PdfTextExtractor.getTextFromPage(pdf, i);
                //System.out.println(content);
            }
            pdfStamper.close();
        } catch (IOException e) {
            
        } catch (DocumentException e) {
            Logger.getLogger(LeerDocumento.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

