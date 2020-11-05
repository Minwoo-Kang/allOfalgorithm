package com.algoFactory.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * User: Minwoo Kang
 * Date: 2020/11/06
 * Time: 12:00 AM
 */

public class Valid_parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        List<Character> openBrackets = Arrays.asList('(', '{', '[');
        List<Character> closeBrackets = Arrays.asList(')', '}', ']');

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (openBrackets.contains(character)) {
                stack.push(character);
            } else {
                if (stack.empty())
                    //close bracket이지만, stack이 빈 경우 invalid
                    return false;

                //character is close bracket
                Character pop = stack.pop();
                if (closeBrackets.contains(pop)) {
                    //현재 char가 close이면서 pop한게 close brackets 중 하나 일 경우 invalid
                    return false;
                }
                int index = closeBrackets.indexOf(character);
                //같은 타입의 open bracket인지 확인
                if (openBrackets.indexOf(pop) != index)
                    return false;
                else
                    continue;

            }

        }

        if (stack.empty())
            return true;
        else
            //loop가 끝난 후 stack에 남아있다면 invalid
            return false;
    }
}
