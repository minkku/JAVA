package exec_01;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			// cards[i] cards[j] . 와 의 값을 서로 바꾼다
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM ) {
			return null;
		}
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
}
