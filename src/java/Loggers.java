public class Loggers {
  public static void main(String[] args) {
    Logger basic = new Logger();
    basic.log("testing");
    Logger warn = new WarningLogger();
    warn.log("testing");

    Parent p = new Parent();
    Son s = new Son();
    System.out.println(p.getName());
    System.out.println(s.getName());
    System.out.println(s.getParentName());
  }
}

class Logger {
  private String prefix;
  protected Logger(String prefix){
    this.prefix = prefix;
  }

  public Logger(){
    this("Default Logger: ");
  }

  public void log(String message){
    System.out.println(prefix + message);
  }
}

class WarningLogger extends Logger{
  public WarningLogger(){
    super("Warning Logger: ");
  }
}

class Parent {
  private String name;
  public Parent(){
    this.name = "parent";
  }
  
  public String getName(){
    return this.name;
  }
}

class Son extends Parent{
  private String name;
  public Son(){
    super();
    this.name = "son";
  }

  @Override
  public String getName(){
    return this.name;
  }

  public String getParentName(){
    return super.getName();
  } 
}