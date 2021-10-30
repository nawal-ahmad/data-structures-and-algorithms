package stack.and.queue.structure;

public class BracketsStack extends GenericStack {

    GenericStack<Character> stack = new GenericStack<Character>();

    public boolean bracket(String str){
        for (char chr:str.toCharArray()) {
            if (chr =='{' || chr=='(' || chr=='['){
                stack.push(chr);
            }else if(chr=='}' && stack.peak()=='{' && !stack.isEmpty()){
                stack.pop();
            }else if(chr ==')' && !stack.isEmpty() && stack.peak()=='('){
                stack.pop();
            }else if(chr == ']' && !stack.isEmpty() && stack.peak()=='[' ){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
