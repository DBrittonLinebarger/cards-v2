package edu.cnm.deepdive;

public abstract class Player<T extends Hand> {

  private T hand;

  public abstract boolean canAccept();

  public void accept(Card card) {
    hand.add(card);
  }

  public T getHand() {
    return hand;
  }

  private void reset() {
    hand.reset();
  }
}
