package com.vlsu.studies.tree;

public class ConjunctionNode implements INode<Boolean> {
    private INode<Boolean> leftNode;
    private INode<Boolean> rightNode;

    public ConjunctionNode(INode<Boolean> left, INode<Boolean> right) {
        leftNode = left;
        rightNode = right;
    }

    public Boolean calculate() {
        return leftNode.calculate() && rightNode.calculate(); //Выполняется "ленивое" И, оптимизация в котором сделана до нас
    }

    @Override
    public String toString()
    {
        return "(" + leftNode + " ∧ " + rightNode + ")";
    }

}
