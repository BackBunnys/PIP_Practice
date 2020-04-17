package com.vlsu.studies;

import com.vlsu.studies.graph.INode;
import com.vlsu.studies.graph.SimpleNode;
import com.vlsu.studies.graph.tree.logicalExpressions.*;

public class App {

    public void run()
    {
        INode expression1 = new ConjunctionNode(
                new ConjunctionNode(
                    new SimpleNode<Boolean>(true),
                    new NegationNode(new SimpleNode<Boolean>(false))),
                new NegationNode(new SimpleNode<Boolean>(true))
        );

        System.out.println(expression1 + " = " + expression1.calculate());

        INode expression2 = new NegationNode(
                new ConjunctionNode(
                    new NegationNode(new SimpleNode<Boolean>(true)),
                    new NegationNode(new SimpleNode<Boolean>(false)))
        );

        System.out.println(expression2 + " = " + expression2.calculate());
    }

}
