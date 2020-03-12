import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class ShapeShift {

  public static void main(String[] args) {

    Table person = new Table("Person");
    Field person_name = new Field("String", "person_name");
    Field person_age = new Field("int", "person_age");
    person.addField(person_name);
    person.addField(person_age);

    STGroup group = new STGroupFile("class.stg");
    ST st = group.getInstanceOf("entry");
    st.add("schema", person);

    System.out.println(st.render());
  }

}
