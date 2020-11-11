public class Holiday {
    private String name;
    private int day;
    private String month;
    String[] arrayMonths = new String[] { "Settembre", "Novembre" , "Ottobre" , "Gennaio"  };
    Integer[] arrayDays = new integer[] {21, 31, 22, 4, 7, 15, 16};

    Public Holiday(String name, int day, String month) {
        name = name;
        day = day;
        month = month;
    }

    public static String[] inSameMonth(String[] arrayMonths) {
        for(int i = 0; i < arrayMonths.length - 1; i++) {
            if(arrayMonths[i] == arrayMonths[i + 1]) {
                return true;
            }
        }    
    }

    public static Double[] avgDate(integer[] arrayDays) {
        integer sommaDate = 0;
        Double ritorno = 0.1;
        for(int i = 0; i < arrayDays.length - 1; i++) {
            sommaDate += arrayDays[i];
        }
        Integer Media = sommaDate / arraydays.length - 1;
        
        return ritorno;
    }
    
}


    