package edu.insightr.gildedrose;

interface IVisitor {
    void visit(IVisitable o);
    void visit(Dexterity o);
    void visit(AgedBrie o);
    void visit(Elixir o);
    void visit(Sulfuras o);
    void visit(BackstagePasses o);
    void visit(ConjuredCake o);
}

class DebugVisitor implements IVisitor
{
    public void visit(Dexterity o)
    {
    }

    public void visit(AgedBrie o)
    {
    }

    public void visit(Elixir o)
    {
    }

    public void visit(Sulfuras o)
    {
    }

    public void visit(BackstagePasses o)
    {
    }

    public void visit(ConjuredCake o)
    {
    }

    public void visit(IVisitable o)
    {
    }
}