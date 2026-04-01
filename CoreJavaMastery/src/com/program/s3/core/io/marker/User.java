/**
 * 
 */
package com.program.s3.core.io.marker;

import java.io.Serializable;

/**
* This class is used for 
*
* @author Jayaram
*/

// Convert object -> byte stream | persistence / network transfer
public class User implements Serializable {

	private String name;
}

/*
| Serializable            | Externalizable            |
| ----------------------- | ------------------------- |
| Automatic serialization | Manual serialization      |
| Easy to use             | More control              |
| Default mechanism       | Custom read/write methods |
*/