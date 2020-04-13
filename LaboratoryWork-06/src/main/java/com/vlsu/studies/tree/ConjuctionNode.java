package com.vlsu.studies.tree;

public class ConjuctionNode implements INode<Boolean> {
    private INode<Boolean> leftNode;
    private INode<Boolean> rightNode;

    public ConjuctionNode(INode<Boolean> left, INode<Boolean> right) {
        leftNode = left;
        rightNode = right;
    }

    public Boolean calculate() {
        return leftNode.calculate() && rightNode.calculate();
    }

    @Override
    public String toString()
    {
        return "(" + leftNode + ") ∧ (" + rightNode + ")";
    }

}
