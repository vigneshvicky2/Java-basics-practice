public class substring_without_using_builtin_method {
    public static void main(String[] args) {
        String a="abcd";
        String tar ="bcd";
        int ind=0;
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j =0;j<tar.length();j++){
                if(a.charAt(i)==tar.charAt(j)){
                    for(int k =i;k<tar.length();k++){
                        if(a.charAt(k)==tar.charAt(ind++)){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        if(count==tar.length()){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
