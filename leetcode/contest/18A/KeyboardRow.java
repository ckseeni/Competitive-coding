public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<String>();
        HashSet<Character> h1 = new HashSet<Character>();
        HashSet<Character> h2 = new HashSet<Character>();
        HashSet<Character> h3 = new HashSet<Character>();
        h1.add('Q');h1.add('W');h1.add('E');h1.add('R');h1.add('T');h1.add('Y');h1.add('U');h1.add('I');h1.add('O');h1.add('P');
        h1.add('q');h1.add('w');h1.add('e');h1.add('r');h1.add('t');h1.add('y');h1.add('u');h1.add('i');h1.add('o');h1.add('p');
        h2.add('A');h2.add('S');h2.add('D');h2.add('F');h2.add('G');h2.add('H');h2.add('J');h2.add('K');h2.add('L');
        h2.add('a');h2.add('s');h2.add('d');h2.add('f');h2.add('g');h2.add('h');h2.add('j');h2.add('k');h2.add('l');
        h3.add('Z');h3.add('X');h3.add('C');h3.add('V');h3.add('B');h3.add('N');h3.add('M');
        h3.add('z');h3.add('x');h3.add('c');h3.add('v');h3.add('b');h3.add('n');h3.add('m');
        for(int i=0;i<words.length;i++){
            String a = words[i];
            int j=0;
            for(j=0;j<a.length();j++){
                if(!h1.contains(a.charAt(j)))
                    break;
            }
            if(j==a.length())
                arr.add(a);
            j=0;
            for(j=0;j<a.length();j++){
                if(!h2.contains(a.charAt(j)))
                    break;
            }
             if(j==a.length())
                arr.add(a);
            j=0;
            for(j=0;j<a.length();j++){
                if(!h3.contains(a.charAt(j)))
                    break;
            }
             if(j==a.length())
                arr.add(a);
        }
        String ar[] = new String[arr.size()];
        for(int i=0;i<arr.size();i++)
            ar[i] = arr.get(i);
        return ar;
    }
}Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:

    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.

