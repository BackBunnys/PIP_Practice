package com.vlsu.studies.graph.tree.logicalExpressions;

import com.vlsu.studies.graph.INode;

public class ConjunctionNode implements INode<Boolean> {
    private INode<Boolean> leftNode;
    private INode<Boolean> rightNode;

    public ConjunctionNode(INode<Boolean> left, INode<Boolean> right) {
        leftNode = left;
        rightNode = right;
    }

    public Boolean calculate() {
        return leftNode.calculate() && rightNode.calculate(); //&& - логическое И, которое само по себе не продолжает
                                                              //вычисления, если результат понятен по левой части
    }

    @Override
    public String toString()
    {
        return "(" + leftNode + " ∧ " + rightNode + ")";
    }

}
