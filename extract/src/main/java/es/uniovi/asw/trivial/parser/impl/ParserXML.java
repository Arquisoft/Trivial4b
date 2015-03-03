package es.uniovi.asw.trivial.parser.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;






import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
import es.uniovi.asw.trivial.parser.Parser;

public class ParserXML implements Parser {

	private String inputFilePath;

	public ParserXML(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	@Override
	public List<Pregunta> parse() {
		List<Pregunta> preguntas = new ArrayList<Pregunta>();
		SAXBuilder saxB = new SAXBuilder();
		File xml = new File(inputFilePath);
		Document document = null;
		try {
			document = (Document) saxB.build(xml);
		} catch (JDOMException jdom) {
			  System.out.println( jdom.getMessage() );
		} catch (IOException e1) {
			System.out.println( e1.getMessage() );
		}
        Element rootNode = document.getRootElement(); 
        List<Element> elements = rootNode.getChildren();
        for(int i=0; i< elements.size(); i++){
        	 Element element = (Element) elements.get(i); 
        	 List<Element> childrens = element.getChildren();
        	 List<Respuesta> respuestas = new ArrayList<Respuesta>();
        	 String enunciado="";
        	 for(int j=0; j< childrens.size(); j++){
        		 Element e = (Element) childrens.get(j);
        		 if(e.getName() == "enunciado"){
        			  enunciado =e.getText();
        		 }
        		 else if(e.getName() == "respuesta"){
        			 Respuesta respuesta = new Respuesta(e.getText(), Boolean.parseBoolean(e.getAttributeValue("valor")));
        			 respuestas.add(respuesta);
        		 }
        	 }
        	Pregunta pregunta = new Pregunta(enunciado, respuestas);
        	preguntas.add(pregunta);
        	
        }
       return preguntas;
	}
	

}
