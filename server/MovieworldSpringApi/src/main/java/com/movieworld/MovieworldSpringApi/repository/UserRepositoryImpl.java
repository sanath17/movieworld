package com.movieworld.MovieworldSpringApi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.movieworld.MovieworldSpringApi.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

		
		@PersistenceContext
		private EntityManager em;
		
		@Override
		public List<User> findAll() {
			TypedQuery<User> query = em.createNamedQuery("User.findAll", User.class);
			return query.getResultList();
		}
		
		@Override
		public User findByEmail(User email) {
			TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
			query.setParameter("pEmail", email);
			List<User> users = query.getResultList();
			if (users != null && users.size() == 1) {
				return users.get(0);
			}
			return null;
		}

		@Override
		public User findOne(User userId) {
			return em.find(User.class, userId);
		}

		@Override
		public User create(User userId) {
			em.persist(userId);
			return userId;
		}

		@Override
		public User update(User userId) {
			return em.merge(userId);
		}

		@Override
		public void delete(User userId) {
			em.remove(userId);
		}

}
