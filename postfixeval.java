class dummy
{
 
   public static int evaluatePostFix(String S) {
    Stack<Integer> stack = new Stack<>();
    
    // Step 1: Iterate through each character in the postfix expression
    for (char i : S.toCharArray()) {
        // Step 2: Check if the character is a digit (operand)
        if (i >= '0' && i <= '9') {
            int num = i - '0'; // Convert the character to an integer
            stack.push(num);
        } else {
            // Step 3: If it's an operator, pop two operands and perform the operation
            int snum = stack.pop();
            int fnum = stack.pop();
            
            if (i == '+') {
                stack.push(fnum + snum);
            } else if (i == '-') {
                stack.push(fnum - snum);
            } else if (i == '*') {
                stack.push(fnum * snum);
            } else if (i == '/') {
                stack.push(fnum / snum);
            }
        }
    }
    
    // Step 4: The final result in the stack is the result of the expression
    return stack.pop();
}

    
}
