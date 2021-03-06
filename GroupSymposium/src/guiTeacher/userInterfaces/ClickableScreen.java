/*******************************************************************************
 * Copyright (c) 2016-2017 Benjamin Nockles
 *
 * This file is part of OrcMath.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License 
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package guiTeacher.userInterfaces;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.interfaces.Clickable;
import guiTeacher.interfaces.Dragable;
import guiTeacher.interfaces.Visible;
import rhbattlesandstuff.NotPokemonDungeonFinalFantasyCrossOverGame;

public abstract class ClickableScreen extends Screen implements MouseListener, MouseMotionListener {

	private ArrayList<Clickable> clickables;
	private Dragable draggedItem;

	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public abstract void initAllObjects(List<Visible> viewObjects);

	@Override
	public void initObjects(List<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible v: viewObjects){
			if(v instanceof Clickable){
				clickables.add((Clickable)v);
			}
		}
	}

	public void mouseClicked(MouseEvent m) {
		cursorTo("src/resources/mouse4.png");
		for(Clickable c: clickables){
			if(c.isHovered(m.getX(), m.getY())){
				c.act();
				break;
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cursorTo("src/resources/mouse3.png");
	}

	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable)v);
		}
	}



	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		cursorTo("src/resources/mouse3.png");
	}
	private void cursorTo(String s){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(s);
		Cursor c = toolkit.createCustomCursor(image , new Point(0, 0), "img");
		NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setCursor (c);
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent m) {
		cursorTo("src/resources/mouse4.png");
		for(Clickable c: clickables){
			if(c.isHovered(m.getX(), m.getY())){
				if(c instanceof Dragable){
					Dragable item = (Dragable)c;
					if(item.setStart(m.getX(),m.getY())){
						draggedItem = item;
						
					}
					break;
				}
			}
		}
	}

	public void mouseReleased(MouseEvent m) {
		cursorTo("src/resources/mouse3.png");
		if(draggedItem!=null){
			draggedItem.setFinish(m.getX(),m.getY());
			draggedItem = null;
		}
	}

	public MouseListener getMouseListener(){
		return this;
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(draggedItem != null)draggedItem.setHeldLocation(e.getX(),e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		cursorTo("src/resources/mouse3.png");
		for(Clickable c: clickables){
			if(c.isHovered(m.getX(), m.getY())){
				c.hoverAction();
			}
		}
	}

}
