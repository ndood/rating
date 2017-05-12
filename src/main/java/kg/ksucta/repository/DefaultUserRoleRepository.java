package kg.ksucta.repository;

import kg.ksucta.domain.user.UserRole;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DefaultUserRoleRepository extends BaseCustomRepository implements CustomUserRoleRepository {

    public DefaultUserRoleRepository() {
        super(UserRole.class);
    }

    @Override
    public Optional<UserRole> findByRole(String role) {
        Criteria criteria = getCriteria();
        criteria.add(Restrictions.eq("role", role));
        return (Optional<UserRole>) criteria.uniqueResult();
    }

    @Override
    public Optional<UserRole> findByUserId(Long userId) {
        Criteria criteria = getCriteria();
        criteria.add(Restrictions.eq("user_id", userId));
        return (Optional<UserRole>) criteria.uniqueResult();
    }

    @Override
    public Optional<UserRole> findByUserIdAndRole(String userId, String role) {
        Criteria criteria = getCriteria();
        criteria.add(Restrictions.eq("user_id", userId));
        criteria.add(Restrictions.eq("role", role));
        return (Optional<UserRole>) criteria.uniqueResult();
    }

    @Override
    public Optional<UserRole> findAll() {
        return null;
    }
}
