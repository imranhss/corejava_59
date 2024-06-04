package testxm59;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWriter {

    public static void main(String[] args) {
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Use the factory to create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Create a new Document
            Document document = builder.newDocument();

            // Create the root element
            Element root = document.createElement("company");
            document.appendChild(root);

            // Create and append employee elements
            // Employee 1
            Element employee1 = document.createElement("employee");
            root.appendChild(employee1);

            Element id1 = document.createElement("id");
            id1.appendChild(document.createTextNode("1"));
            employee1.appendChild(id1);

            Element name1 = document.createElement("name");
            name1.appendChild(document.createTextNode("Najmul Islam"));
            employee1.appendChild(name1);

            Element position1 = document.createElement("position");
            position1.appendChild(document.createTextNode("Software Engineer"));
            employee1.appendChild(position1);

            Element salary1 = document.createElement("salary");
            salary1.appendChild(document.createTextNode("60000"));
            employee1.appendChild(salary1);

            // Employee 2
            Element employee2 = document.createElement("employee");
            root.appendChild(employee2);

            Element id2 = document.createElement("id");
            id2.appendChild(document.createTextNode("2"));
            employee2.appendChild(id2);

            Element name2 = document.createElement("name");
            name2.appendChild(document.createTextNode("Jane Smith"));
            employee2.appendChild(name2);

            Element position2 = document.createElement("position");
            position2.appendChild(document.createTextNode("Project Manager"));
            employee2.appendChild(position2);

            Element salary2 = document.createElement("salary");
            salary2.appendChild(document.createTextNode("80000"));
            employee2.appendChild(salary2);
            
            
            Element raju=document.createElement("employee");
            root.appendChild(raju);
            
            Element rajuId=document.createElement("id");
            rajuId.appendChild(document.createTextNode("3"));
            raju.appendChild(rajuId);
            
            Element rajuName=document.createElement("name");
            rajuName.appendChild(document.createTextNode("Raju Ahmed"));
            raju.appendChild(rajuName);
            
            Element rajuPosition=document.createElement("position");
            rajuPosition.appendChild(document.createTextNode("JEE Student"));
            raju.appendChild(rajuPosition);
            
            Element rajuSalary=document.createElement("salary");
            rajuSalary.appendChild(document.createTextNode("20000"));
            raju.appendChild(rajuSalary);
            
            
            

            // Create a TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            // Use the factory to create a Transformer
            Transformer transformer = transformerFactory.newTransformer();

            // Create a DOMSource for the Document
            DOMSource source = new DOMSource(document);

            // Create a StreamResult for the output file
            StreamResult result = new StreamResult(new File("output.xml"));

            // Transform the DOM to the output file
            transformer.transform(source, result);

            System.out.println("XML file created successfully!");

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

}
