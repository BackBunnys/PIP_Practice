package com.vlsu.studies.graph.tree.logicalExpressions;

import com.vlsu.studies.graph.INode;

public class NegationNode implements INode<Boolean> {
    private INode<Boolean> node;


    public NegationNode(INode<Boolean> node) {
        this.node = node;
    }

    public Boolean calculate() {
        return !node.calculate();
    }

    @Override
    public String toString() {
        return "(¬" + node + ")";
    }


}
