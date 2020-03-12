import java.util.ArrayList;
import java.util.List;

public class Table {

  String name;
  List<Field> fields = new ArrayList<>();

  public Table(String name) {
    this.name = name;
  }

  public void addField(Field field) {
    fields.add(field);
  }

  public String getName() {
    return name;
  }

  public List<Field> getFields() {
    return fields;
  }
}
