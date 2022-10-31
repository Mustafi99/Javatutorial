public class Test2 {
    public static void main(String[] args) {
        String name = "Selenium";
        int count;
        char ch [] = name.toCharArray();
        for (int i = 0; i <name.length() ; i++) {
            count =1;
            for (int j = i+1; j < name.length(); j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = '0';
                }
            }
            
            if(count> 0 && ch[i] !='0'){
                    System.out.print("  " + ch[i] );
                }
                
            }

        }
    }