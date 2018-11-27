package edu.insightr.gildedrose;

interface IVisitor {
    void visit(IVisitable o);
    void visit(Dexterity o);
    void visit(AgedBrie o);
    void visit(Book o);
}

class DebugVisitor implements IVisitor
{
    public void visit(Dexterity o)
    {
        System.out.println("Breed : " + o.breed);
    }

    public void visit(AgedBrie o)
    {
        System.out.println("Gender : " + o.gender);
    }

    public void visit(Book o)
    {
        System.out.println("Color : " + o.color);
    }

    public void visit(IVisitable o)
    {
        System.out.println("Not implemented yet");
    }
}