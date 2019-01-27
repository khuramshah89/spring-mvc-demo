import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Khuram Shah on 1/25/2019.
 */
public class ImageCrop extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException,ServletException{

        int t=Integer.parseInt(req.getParameter("t"));
        int l=Integer.parseInt(req.getParameter("l"));
        int w=Integer.parseInt(req.getParameter("w"));
        int h=Integer.parseInt(req.getParameter("h"));
        String imagePath=getServletContext().getRealPath("/")+req.getParameter("i");
        BufferedImage outImage=ImageIO.read(new File(imagePath));
        BufferedImage cropped=outImage.getSubimage(l, t, w, h);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        ImageIO.write(cropped,req.getParameter("f"), out);

        ImageIO.write(cropped,req.getParameter("f"),
                new File(getServletContext().getRealPath("")+System.getProperty("file.separator")
                        +"cropped.jpg")); // save the file with crop dimensions

//res.setContentType("image/jpg");
        ServletOutputStream wrt=res.getOutputStream();
        wrt.write(out.toByteArray());
        wrt.flush();
        wrt.close();

    }

}
