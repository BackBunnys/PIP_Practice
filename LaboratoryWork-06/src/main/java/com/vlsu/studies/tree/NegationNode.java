package com.vlsu.studies.tree;

public class NegationNode implements INode<Boolean> {
    private INode<Boolean> node;


    public NegationNode(INode<Boolean> node) {
        this.node = node;
    }

    public Boolean calculate() {
        return !node.calculate();
    } //Операция унарная, оптимизировать нельзя

    @Override
    public String toString() {
        return "(¬" + node + ")";
    }


}
