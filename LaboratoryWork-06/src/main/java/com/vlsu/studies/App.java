package com.vlsu.studies;

import com.vlsu.studies.tree.*;

public class App {

    public void run()
    {
        INode Expression1 = new ConjunctionNode(
                new ConjunctionNode(
                    new SimpleNode<Boolean>(true),
                    new NegationNode(new SimpleNode<Boolean>(false))),
                new NegationNode(new SimpleNode<Boolean>(true))
        );

        System.out.println(Expression1 + " = " + Expression1.calculate());

        INode Expression2 = new NegationNode(
                new ConjunctionNode(
                    new NegationNode(new SimpleNode<Boolean>(true)),
                    new NegationNode(new SimpleNode<Boolean>(false)))
        );

        System.out.println(Expression2 + " = " + Expression2.calculate());
    }

}
