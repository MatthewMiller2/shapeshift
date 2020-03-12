import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class ShapeShift {

  public static void main(String[] args) {

    Table person = new Table("Person");
    person.addField(new Field("String", "name"));
    person.addField(new Field("int", "age"));

    STGroup group = new STGroupFile("class.stg");
    ST st = group.getInstanceOf("entry");
    st.add("schema", person);

    System.out.println(st.render());
  }

}
