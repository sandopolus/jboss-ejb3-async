/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
  *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.ejb3.async.impl;

import java.io.Serializable;
import java.util.UUID;

import org.jboss.ejb3.async.spi.AsyncInvocationId;

/**
 * Implementation of {@link AsyncInvocationId} backed by a 
 * {@link UUID}
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class AsyncInvocationIdUUIDImpl implements AsyncInvocationId, Serializable
{
   /**
    * serialVersionUID
    */
   private static final long serialVersionUID = 1L;
   /**
    * Backing UUID
    */
   private final UUID uuid;

   /**
    * Constructor
    */
   public AsyncInvocationIdUUIDImpl()
   {
      uuid = UUID.randomUUID();
   }

   /**
    * {@inheritDoc}
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      return uuid.hashCode();
   }

   /**
    * {@inheritDoc}
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(final Object obj)
   {
      if (this == obj) {
          return true;
      }
      if (obj instanceof AsyncInvocationIdUUIDImpl) {
          return uuid.equals(((AsyncInvocationIdUUIDImpl)obj).uuid);
      }
      return false;
   }

   /**
    * {@inheritDoc}
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "AsyncInvocationIdUUIDImpl [uuid=" + uuid + "]";
   }

}
