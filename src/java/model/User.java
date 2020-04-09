/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rob
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
	, @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId")
	, @NamedQuery(name = "User.findByFName", query = "SELECT u FROM User u WHERE u.fName = :fName")
	, @NamedQuery(name = "User.findByLName", query = "SELECT u FROM User u WHERE u.lName = :lName")
	, @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
	, @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
	, @NamedQuery(name = "User.findByAddress", query = "SELECT u FROM User u WHERE u.address = :address")
})
public class User implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userId")
	private Integer userId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "f_name")
	private String fName;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "l_name")
	private String lName;
	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
	private String email;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
	private String password;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "address")
	private String address;

	public User()
	{
	}

	public User(Integer userId)
	{
		this.userId = userId;
	}

	public User(Integer userId, String fName, String lName, String email, String password, String address)
	{
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getFName()
	{
		return fName;
	}

	public void setFName(String fName)
	{
		this.fName = fName;
	}

	public String getLName()
	{
		return lName;
	}

	public void setLName(String lName)
	{
		this.lName = lName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (userId != null ? userId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof User))
		{
			return false;
		}
		User other = (User) object;
		if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "model.User[ userId=" + userId + " ]";
	}
	
}
