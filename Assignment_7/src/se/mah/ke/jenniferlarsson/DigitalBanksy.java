package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class DigitalBanksy extends JPanel {

	private BufferedImage bufferedImage;

	/**
	 * Create the frame.
	 */
    public static void main(String[] args) {
        int width = 640;
        int height = 480;
        JFrame frame = new JFrame("Direct draw demo");

        DigitalBanksy panel = new DigitalBanksy(width, height);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        
        //ny tråd
		panel.new DrawOnTvThread().start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private BufferedImage canvas;

    public DigitalBanksy(int width, int height) {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.BLUE);
        drawRect(Color.RED, 0, 0, width/2, height/2);
    }

    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }


    public void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }


    public void drawLine(Color c, int x1, int y1, int x2, int y2) {
        // Implement line drawing
        repaint();
    }

    public void drawRect(Color c, int x1, int y1, int width, int height) {
        int color = c.getRGB();
        // Implement rectangle drawing
        for (int x = x1; x < x1 + width; x++) {
            for (int y = y1; y < y1 + height; y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }

    public void drawOval(Color c, int x1, int y1, int width, int height) {
        // Implement oval drawing
        repaint();
    }
    
    
    //tråden
    private class DrawOnTvThread extends Thread {
    
    	@Override
		public void run(){
    		PixelController c = PixelController.getInstance(Screen.MEDEA_1);
    		while (!c.isConnected()) {
    			try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
    			System.out.println("Connecting");
    		}
    		
            //drawRect(Color.RED, 0, 0, width/2, height/2);
    		
    		int width = c.getNumberPixelsShortestSide();
    		int height = c.getNumberPixelsWidestSide();

            Color color = Color.RED;
            // Implement rectangle drawing
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                	c.setPixel(x, y, color);
                }
            }
    	}
    }
    //tråden ansluter till en skärm
    //tråden har en while-loop som väntar på att isCOnnected() är sann
    //tråden ritar på skärmen
}
