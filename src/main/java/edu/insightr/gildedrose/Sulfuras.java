package edu.insightr.gildedrose;

interface IVisitable {
    void accept(IVisitor visitor);
}

public class Sulfuras extends Item implements IVisitable {
    super(name, sellIn, quality);

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }

}
