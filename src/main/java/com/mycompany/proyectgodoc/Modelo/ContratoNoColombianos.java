package com.mycompany.proyectgodoc.Modelo;

import com.google.common.io.FileWriteMode;
import com.itextpdf.testutils.ITextTest;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.TabStop;
import com.itextpdf.text.pdf.BaseFont;
import java.io.FileInputStream;
import javax.swing.JOptionPane;





public class ContratoNoColombianos {
        
    
    public void GenerarPDF(){
        
        try {
            
            Document doc = new Document();
            
            FileOutputStream file = new FileOutputStream("ContratoNOColombia.pdf");
            PdfWriter.getInstance(doc, file);
            
            doc.setMargins(68.03f, 68.03f, 72f, 72f);
            doc.open();
            
            Image imagen = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen.scaleAbsoluteWidth(200);
            imagen.scaleAbsoluteHeight(130);
            imagen.scaleAbsolute(460, 100);
            doc.add(imagen);
            
            
            Paragraph texto1 = new Paragraph("Entre los suscritos: CARMEN CECILIA QUERO DE GONZALEZ, mayor de edad vecino de esta ciudad,  "
                    + "portadora de la cedula de ciudadanía 37.219.308 expedida en Cúcuta, en su condición de REPRESENTANTE LEGAL "
                    + "DE LA FUNDACION DE ESTUDIOS SUPERIORES COMFANORTE FESC, entidad sin Ánimo de Lucro, con Personería Jurídica"
                    + " Resolución No. 4172 del 25 de agosto de 1993, quien en adelante se denominara EL CONTRATANTE, por una parte,"
                    + " y, " +/*NOMBRE*/ "también mayor de edad, portador(a) del documento de identidad C.E. No. " + /*CEDULA*/", persona natural no "
                    + "residente en el territorio colombiano, quien para efectos del presente documento se denominara CONTRATISTA,"
                    + " por la otra parte, hemos convenido celebrar el presente CONTRATO DE PRESTACION DE SERVICIOS PROFESIONALES con"
                    + " base a las siguientes consideraciones:");
            texto1.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto1);
            doc.add(new Paragraph("\n"));
            BaseFont fuente = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1250, true);
            Paragraph texto2 = new Paragraph("La FUNDACION DE ESTUDIOS SUPERIORES COMFANORTE FESC, requiere el apoyo de personal calificado para la "
                    + "ejecución y desarrollo de diferentes programas académicos de la FESC, para lo cual el presente contrato de prestación de servicios"
                    + " se desarrollará conforme a las siguientes clausulas:" + "\n" + "\n"
                    
                    + "CLAUSULA PRIMERA: OBJETO. El contratista prestara sus servicios "
                    + "profesionales como apoyo a la ejecución de los diferentes proyectos académicos de la FESC,  orientando al talento humano adscrito a "
                    + "las diferentes actividades misionales y administrativas,  mediante asesorías, consultorías y desarrollo académico adicional, garantizando "
                    + "el crecimiento y mejora en relación con los conocimientos, actitudes hacia el trabajo,  y calidad humana del recurso para el cual se"
                    + " contrata en el tiempo acordado entre las partes." + "\n" + "\n" 
                    
                    + "CLAUSULA SEGUNDA: VALOR. El valor del presente contrato es de $" +/*ValorContrato*/ " , monto que está sujeto a la programación final de las acciones concertadas. "
                    + "La programación se realiza de acuerdo con la disponibilidad del tiempo que previamente mediante el formato establecido FPESF-4.1-5, EL CONTRATISTA "
                    + "informa al CONTRATANTE y es el soporte para la ejecución de las actividades adscritas al presente contrato." + "\n" + "\n"+"\n" );
            texto2.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto2);
                    
            doc.add(new Paragraph("\n"));
            Image imagen2 = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen2.scaleAbsoluteWidth(200);
            imagen2.scaleAbsoluteHeight(130);
            imagen2.scaleAbsolute(460, 100);
            doc.add(imagen2);
            doc.add(new Paragraph("\n"));
            Paragraph texto3 = new Paragraph ("CLAUSULA TERCERA: FORMA DE PAGO. El presente contrato se cancelará previa presentación de la cuenta de cobro, cuyo valor estará soportado en la"
                    + " programación final de las acciones concertadas. Asimismo se deberá anexar el informe de actividades firmado por el supervisor del contrato y póliza"
                    + " o seguro de viaje. " + "\n" + "\n" 
                    
                    + "PARAGRAFO PRIMERO: LA FESC podrá retener las sumas correspondientes a los impuestos en los porcentajes establecidos en la ley, así mismo La FESC queda"
                    + " exonerada de pagar al CONTRATISTA el valor que corresponda a las actividades planeadas no ejecutadas. " + "\n" + "\n" 
                    
                    + "PARAGRAFO SEGUNDO: LA FESC no se responsabilizará por la demora presentada en el pago al CONTRATISTA cuando ella fuere ocasionada por encontrarse incompleta"
                    + " la documentación de soporte o no se ajuste a cualquiera de las condiciones establecidas en el presente contrato. " + "\n" + "\n" 
                    
                    + "PARAGRAFO TERCERO: LA FESC no cancelará las sumas que excedan el valor total establecido en el presente contrato o no estén estipuladas dentro del objeto de "
                    + "la misma, a excepción de las autorizaciones otorgadas previamente por el ordenador del gasto." + "\n" + "\n" 
                    
                    + "CLAUSULA CUARTA: PLAZO El contratista desarrollara las actividades contratadas en un plazo desde el " +/*fecha inicio y fin */ ", previo cumplimiento de los "
                    + "requisitos de perfeccionamiento del contrato." + "\n" + "\n" 
                    
                    + "CLAUSULA QUINTA: SUPERVISIÓN. a) La supervisión del desarrollo del objeto del presente contrato de prestación de servicios profesionales será realizada por el "
                    + "director del programa b) Gestión humana verificará el cumplimiento mediante la revisión de los parámetros establecidos. " + "\n" + "\n" + "\n" + "\n");
            texto3.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto3);
            Image imagen3 = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen3.scaleAbsoluteWidth(200);
            imagen3.scaleAbsoluteHeight(130);
            imagen3.scaleAbsolute(460, 100);
            doc.add(imagen3);
            
            Paragraph texto4 = new Paragraph("\n"+ "CLAUSULA SEXTA: OBLIGACIONES DEL CONTRATISTA: a) Abstenerse de tener relaciones personales con los individuos que integran la comunidad estudiantil , dentro y "
                    + "fuera de la institución durante el termino del presente contrato b) Cumplir el Estatuto y  los Reglamentos de la FESC que le apliquen para garantizar el cumplimiento "
                    + "del contrato c) Dará buen uso a los materiales devolutivos y de consumo según las directrices de la FESC y devolverá los mismos al finalizar el contrato d) Cumplir en "
                    + "forma eficiente en el plazo establecido los trabajos encomendados y aquellas obligaciones que se generen de acuerdo con la naturaleza del servicio. e)  Se obliga a cumplir"
                    + " con lo estipulado en las demás cláusulas y condiciones previstas en este documento. D) A permitir el tratamiento de los datos personales que se suministren en desarrollo "
                    + "del presente objeto, durante todo el tiempo de permanencia en la entidad y después de terminada la relación siempre y cuando exista un deber de conservación legal o contractual"
                    + " por parte de La FESC. La autorización de tratamiento de datos personales se otorga por parte del docente dentro de lo descrito en la Política de Protección de Datos Personales, "
                    + "que es conocida por el docente, en todos los casos el docente podrá hacer uso de sus derechos de Habeas Data (conocer, actualizar y rectificar su información con excepción a lo"
                    + " establecido por ley en la siguiente dirección: Av 4 #15-14 barrio La Playa en Cúcuta, o en la sede Ocaña en la dirección KDX 194-785 barrio Llano de los Alcaldes, vía universitaria; "
                    + "a través de correo electrónico habeasdata@fesc.edu.co, o al teléfono (037) 582 9292 Ext: 118. " + "\n" + "\n" 
            
                    + "CLAUSULA SEPTIMA: OBLIGACIONES DE LA FESC: a) Facilitar el acceso a la información y elementos que sean necesarios, de manera oportuna, para la debida ejecución del objeto del contrato, "
                    + "b) La FESC cancelara al CONTRATISTA la cuenta de cobro acorde con las políticas establecidas por la institución c) LA FESC se obliga a cumplir con lo estipulado en las demás cláusulas y "
                    + "condiciones previstas en este documento. " + "\n" + "\n" + "\n" + "\n" 
                    );
            texto4.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto4);
            doc.add(new Paragraph("\n"));
            
            Image imagen4 = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen4.scaleAbsoluteWidth(200);
            imagen4.scaleAbsoluteHeight(130);
            imagen4.scaleAbsolute(460, 100);
            doc.add(imagen4);
            
            Paragraph texto5 = new Paragraph("\n"+ "CLAUSULA OCTAVA: PROHIBICION DE CEDER: El CONTRATISTA no podrá ceder total o parcialmente el presente Contrato de prestación de servicios profesionales a persona alguna "
                    + "sea natural o jurídica, ni hacerse sustituir por terceros en el ejercicio de los derechos o en el cumplimiento de las obligaciones que en el mismo constan, sin el consentimiento previo, expreso "
                    + "y escrito de la FESC." + "\n" + "\n"
                    
                    + "CLAUSULA NOVENA: CLÁUSULA DE CONFIDENCIALIDAD. La información confidencial y todos los derechos derivadas de la misma, permanecerán como propiedad de la FUNDACIÓN DE ESTUDIOS SUPERIORES COMFANORTE, "
                    + "conforme a las obligaciones contenidas en el documento denominado “ANEXO A LA CLAUSULA NOVENA DEL CONTRATO DE PRESTACION DE SERVICIOS PROFESIONALES”, el cual ha sido firmado por las partes y hace parte "
                    + "integral del presente contrato individual de trabajo. " + "\n" + "\n"
                    
                    + "El incumplimiento de esta cláusula por parte del TRABAJADOR, una vez detectado y demostrado el hecho, será considerada como una falta grave y puede suponer el despido disciplinario, es decir, sin indemnización, "
                    + "en aquellos casos especialmente flagrantes. Por otro lado, en el supuesto de que la revelación de la información protegida por la cláusula de confidencialidad se produjese una vez acabada la presente relación laboral, "
                    + "la FUNDACIÓN DE ESTUDIOS SUPERIORES COMFANORTE estará en su derecho de entablar las acciones legales que considere pertinentes." + "\n" + "\n"
                    
                    + "CLAUSULA DECIMA: RESPONSABILIDAD DEL CONTRATISTA: El contratista responderá civil y penalmente por sus acciones y omisiones, en la actuación del presente Contrato. En los términos de la Ley y como consecuencia de ellos "
                    + "quedará sujeto a las sanciones establecidas en la misma." + "\n" + "\n" + "\n");
            texto5.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto5);
            
            Image imagen5 = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen5.scaleAbsoluteWidth(200);
            imagen5.scaleAbsoluteHeight(130);
            imagen5.scaleAbsolute(460, 100);
            doc.add(imagen5);
            
            doc.add(new Paragraph("\n"));
            
            Paragraph texto6 = new Paragraph("CLAUSULA DECIMA PRIMERA: TRATAMIENTO DE DATOS PERSONALES Permitir el tratamiento de sus datos personales, de conformidad a las políticas de protección de datos establecidas por la institución y la normatividad vigente." + "\n" + "\n"
                    
                    + "CLAUSULA DECIMA SEGUNDA: TERMINACIÓN DEL CONTRATO. El presente contrato terminará por vencimiento del plazo pactado. También podrá darse por terminado por mutuo acuerdo entre las partes, o en forma unilateral por LA FESC por el "
                    + "incumplimiento de las obligaciones a cargo del CONTRATISTA derivados del contrato y no dará lugar al pago de ningún tipo de indemnización a favor del CONTRATISTA. " + "\n" + "\n"
                    
                    + "CLAUSULA DECIMA TERCERA: INDEPENDENCIA EL CONTRATISTA prestará sus servicios en forma independiente y con total autonomía técnica, administrativa y financiera. En ningún caso existirá relación laboral entre LA FESC y EL CONTRATISTA, "
                    + "en consecuencia, EL CONTRATISTA asume en forma total y exclusiva la absoluta responsabilidad que se derive de sus actos u omisiones, así como por la calidad e idoneidad de los servicios que preste. " + "\n" + "\n"
                    
                    + "CLAUSULA DECIMA CUARTA: INFORME DE ENTREGA A LA TERMINACIÓN DEL CONTRATO – Conforme lo señala el acuerdo de confidencialidad, es obligación del CONTRATISTA informar inmediatamente a la terminación definitiva de su contrato, bases de "
                    + "datos, equipos, información técnica, académica, que utilizó para poder ejecutar el objeto del contrato, para lo cual deberá diligenciar el formato denominado “INFORME ENTREGA POR FINALIZACIÓN DE CONTRATO DE PRESTACIÓN DE SERVICIOS” "
                    + "implementado por la FESC. Aunado a lo anterior, EL CONTRATISTA se compromete a tramitar y obtener el respectivo paz y salvo ante las dependencias de la institución, para lo cual, el CONTRATISTA acepta expresamente desde ahora, que la "
                    + "omisión, inobservancia e incumplimiento a lo dispuesto en esta cláusula conlleva a la retención de sus honorarios y la consecuente consignación de estos valores a expensas de una autoridad judicial para que, a luz del proceso jurídico "
                    + "pertinente se compensen los daños materiales e inmateriales que esta omisión le genere a La FESC." + "\n" + "\n");
            texto6.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto6);
            Image imagen6 = Image.getInstance("D:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PROYECTGODOC\\Imagenes\\enca.png");
            imagen6.scaleAbsoluteWidth(200);
            imagen6.scaleAbsoluteHeight(130);
            imagen6.scaleAbsolute(460, 100);
            doc.add(imagen6);
            
            doc.add(new Paragraph("\n"));
                    
            Paragraph texto7 = new Paragraph("CLAUSULA DECIMA QUINTA: PROPIEDAD INTELECTUAL. – Si de la ejecución del presente contrato resultan estudios, investigaciones, descubrimientos, invenciones, información, mejoras y/o diseños, éstos pertenecen a la FESC, sin perjuicio del "
                    + "respeto al derecho moral consagrado en la Ley. Así mismo, EL CONTRATISTA garantiza que los trabajos y servicios prestados a la FESC por el objeto de este contrato no infringen ni vulneran los derechos de propiedad " + "\n" + "\n"
                    
                    + "intelectual o industrial o cualesquiera otros derechos legales o contractuales de terceros. Las invenciones – proyectos y demás se regirán por la normatividad establecida a nivel nacional por el Órgano Legislativo responsable y lo consignado "
                    + "en el Reglamento de Derechos de Propiedad Intelectual establecido por la FESC y aprobado por el órgano de gobierno competente" + "\n" + "\n"
                    
                    + "CLAUSULA DECIMA QUINTA: NO EXCLUSIVIDAD. Las partes de común acuerdo establecen que no existirá ningún vínculo de exclusividad en el desarrollo del presente Contrato, por lo tanto, el CONTRATISTA podrá suscribir otros contratos con características "
                    + "similares, sin que ello pueda alegarse como incumplimiento del presente contrato, respetando los tiempos concertados para la ejecución del presente." + "\n" + "\n"
                    
                    + "En constancia se firma el presente contrato en San José de Cúcuta, el día" /*fecha contrato*/ + "\n" + "\n" + "\n" + "\n"+"\n"
                    
                    + "CONTRATANTE                                                           CONTRATISTA" + "\n"
                    + "FESC                                                                  "/*nombre contratista*/ + "\n"
                    + "NIT. 800.235.151-5                                                      C.C "
                    
            
            
            );
            texto7.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(texto7);
            
            doc.close();
            
        } catch (Exception e) {
        }

    }
}