package com.vlsu.studies.graph.tree.logicalExpressions;

import java.util.Collection;
import java.util.Iterator;

import com.vlsu.studies.graph.INode;

public class ConjunctionNode implements INode<Boolean> {
    private final Collection<INode<Boolean>> nodeList;

    public ConjunctionNode(Collection<INode<Boolean>> nodeList)
    throws IllegalArgumentException { //Операция не унарная - должно быть больше одного элемента в коллекции.
        if(nodeList.size() < 2) throw new IllegalArgumentException("ConjunctionNode must be applied to more than 1 node");
        else this.nodeList = nodeList;
    }

    public Boolean calculate() {
        Boolean isTrueState = true;              //"Состояние истинности" выражения.
        Iterator<INode<Boolean>> it =  nodeList.iterator();

        while(isTrueState && it.hasNext()) {     //Пока сохраняется состояние истинности, вычисляем.
            isTrueState = it.next().calculate(); //Если false, смысла вычислять дальше нет, т.к. это логическое И.
        }

        return isTrueState;
    }

    @Override
    public String toString()
    {
        Iterator<INode<Boolean>> it = nodeList.iterator();

        StringBuilder result = new StringBuilder(it.next().toString());

        while(it.hasNext()) {
             result.append(" ∧ ").append(it.next());
         }

        return result.toString();
    }

}
