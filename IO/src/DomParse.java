import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @Author: YanL
 * @Time: 17:25 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DomParse {
    public static void main(String[] args){
        File file = new File("C:\\ly\\java\\learn\\IO\\src\\Student.xml");
        try {
            //创建文档解析的对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            //解析文档，形成文档,生成document对象
            Document document = builder.parse(file);
            //获取根节点
            Element rootElement = document.getDocumentElement();
            System.out.printf("Root Element: %s\n", rootElement.getNodeName());
            //获取根节点下的所有子节点
            NodeList students = rootElement.getChildNodes();
            for(int i = 0; i < students.getLength(); i++){
                //获得第i个子节点
                Node childNode = students.item(i);
                //节点有多种类型，我们需要处理的是元素节点
                //元素节点就是非空的子节点，还有子节点的子节点
                if(childNode.getNodeType() == Node.ELEMENT_NODE){
                    Element childElement = (Element) childNode;
                    System.out.printf(" Element: %s\n", childElement.getNodeName());
                    System.out.printf(" Attribute: id = %s\n", childElement.getAttribute("id"));
                    //第二级子元素
                    NodeList childNodes = childElement.getChildNodes();
                    for(int j = 0; j < childNodes.getLength(); j++){
                        Node child = childNodes.item(j);
                        if(child.getNodeType() == Node.ELEMENT_NODE){
                            Element eChild = (Element) child;
                            System.out.printf(" sub Element: %s value = %s\n", eChild.getNodeName(), eChild.getTextContent());
                        }
                    }
                }
            }
        }catch (ParserConfigurationException p){
            p.printStackTrace();
        }catch (SAXException s){
            s.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }


    }
    /**
     * Root Element: students
     *  Element: student
     *  Attribute: id = 123
     *  sub Element: name value = pink
     *  sub Element: age value = 20
     *  sub Element: gender value = male
     *  Element: student
     *  Attribute: id = 456
     *  sub Element: name value = floyd
     *  sub Element: age value = 22
     *  sub Element: gender value = female
     *  Element: student
     *  Attribute: id = 789
     *  sub Element: name value = queen
     *  sub Element: age value = 23
     *  sub Element: gender value = male
     */

}

