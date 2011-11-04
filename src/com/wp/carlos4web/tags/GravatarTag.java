package com.wp.carlos4web.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * This class implements the tag funcionality.
 * 
 * @author Carlos Alberto Junior Spohr Poletto.
 */
public class GravatarTag extends TagSupport
{
	private static final long serialVersionUID = 1066237315711135837L;
	
	/**
	 * This attribute represents the 'email' param of gravatar tag.
	 */
	protected String 	email;
	
	/**
	 * This attribute represents the 'imageSize' param of gravatar tag.
	 */
	protected int 		imageSize = 200;

	/**
	 * This method implements the IMG injection in JSP page content.
	 */
	@Override
	public int doEndTag() throws JspException
	{
		if(email != null && !email.isEmpty())
		{
			try
			{
				// Gera o hash MD5.
				String hash = MD5.md5Hex(email);
				
				// Monta a URL para a imagem remota.
				String url = "http://www.gravatar.com/avatar/" + hash + "?s=" + imageSize;
				
				// Monta a tag HTML IMG com a URL remota.
				String img = "<img src='" + url + "'/>";
				
				// Insere no corpo da página onde a tag está sendo chamada.
				this.pageContext.getOut().write(img);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return super.doEndTag();
	}

	public String getEmail() {
		return email;
	}
	
	/**
	 * required for tag classes.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * required for tag classes.
	 * @param imageSize
	 */
	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}

	public int getImageSize() {
		return imageSize;
	}
	
}
