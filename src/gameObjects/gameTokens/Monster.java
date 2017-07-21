package gameObjects.gameTokens;

import java.util.*;
import gameObjects.*;

public final class Monster extends GamePiece {
	
	private static final Map<String, Monster> MonsterMap = new HashMap<String, Monster>();
	
	public static final Monster getMonster(final String key) {
		return MonsterMap.get(key);
	}
	
	public static final void initMonsters(final Expansion expansion) {
		
	}

//	Synchronized static method should provide lock to all static variables of this class, including MonsterMap
	public static final void UpdateCultist() {
		
		synchronized (Monster.class) {
			// Here we actually update the values in the MonsterMap; do all SQL stuff outside this block, to reduce block time
		}
		
	}
	
	private final int horror;
	private final int willMod;
	private final int damage;
	private final int strMod;
	private final int maxHealth;
	
	private Monster(final String name, 
					final Expansion expansion, 
					final int horror, 
					final int willMod, 
					final int damage, 
					final int strMod, 
					final int maxHealth) {
		
		super(name, expansion);
		this.horror = horror;
		this.willMod = willMod;
		this.damage = damage;
		this.strMod = strMod;
		this.maxHealth = maxHealth;	
		
	}
	
	/**
	 * @return the horror
	 */
	public final int getHorror() {
		return horror;
	}

	/**
	 * @return the willMod
	 */
	public final int getWillMod() {
		return willMod;
	}

	/**
	 * @return the damage
	 */
	public final int getDamage() {
		return damage;
	}

	/**
	 * @return the strMod
	 */
	public final int getStrMod() {
		return strMod;
	}

	/**
	 * @return the maxHealth
	 */
	public final int getMaxHealth() {
		return maxHealth;
	}
	
}
