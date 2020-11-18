class Logger {
    private prefix;
    public Logger(){
      prefix = "Default Logger: ";
    }
    public Logger(String prefix){
      this.prefix = prefix;
    }
    public void Log(String value){
      System.out.println(prefix + value);      
    }
  }
  
  class WarningLogger extends Logger{
    
  }
  // log
