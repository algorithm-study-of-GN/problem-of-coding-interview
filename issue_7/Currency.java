//2016.06.14 Eunice

public class Currency {
    private int value;

    public Currency(int value){
        this.value = value;
    }

    public String toUSD(){

        String str = Integer.toString(value);
        int n = str.length();

        int comma = n/3-1;
        int first_part = n%3;
        if(first_part==0) first_part=3;

        StringBuilder sb = new StringBuilder();
        sb.append("$");
        sb.append(str.substring(0,first_part));

        for(int i=first_part; i<n; i+=3){
            sb.append(",");
            sb.append(str.substring(i,i+3));
        }

        return sb.toString();

    }


    public static void main(String[] args) {

        Currency currency = new Currency(123456789);
        System.out.println(currency.toUSD());

    }

}
