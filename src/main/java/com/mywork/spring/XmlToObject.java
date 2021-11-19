package com.mywork.spring;

import com.mywork.spring.ContextStore.order;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class XmlToObject {
    public static void main(String[] args) throws JAXBException, IOException {
        File file = new File("C:\\WS\\MyUtils\\SpringLearning\\src\\main\\java\\com\\mywork\\spring\\input.xml");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = "";
        String xml;
        while ((xml = br.readLine()) != null) {
            System.out.println(xml);
            str= str+xml;
        }

        System.out.println(getFindAttributeValueInStringOrder("ARM_GT_ARM_Project_Id",str));
        //convert(file);
      /*         JAXBContext jc = JAXBContext.newInstance(order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        order root = (order) unmarshaller.unmarshal(new FileInputStream(file));
        System.out.println("");*/
    }



    public static String getFindAttributeValueInStringOrder(String attributeName, String order){
        String value = null;

        StringBuilder input = new StringBuilder();
        input.append(order);
        input.reverse();

        StringBuilder attribute = new StringBuilder();
        attribute.append(attributeName);
        attribute.reverse();

        String subStr = input.substring(input.indexOf(String.valueOf(attribute)));
        subStr = subStr.substring(subStr.indexOf(">eulav/<")+">eulav/<".length());
        subStr = subStr.substring(0,subStr.indexOf(">eulav<"));

        StringBuilder output = new StringBuilder();
        output.append(subStr);
        output.reverse();

        value = String.valueOf(output);
        return value;
    }

/*    public static void convert(File file){
        XmlMapper xmlMapper = new XmlMapper();
        try {
            order order = xmlMapper.readValue(file, order.class);
        } catch (Exception e ) {
        }
    }*/
}
