package please.change.me.common.exclusivecontrol;

import java.util.List;

import nablarch.common.exclusivecontrol.ExclusiveControlContext;
import nablarch.common.exclusivecontrol.ExclusiveControlManager;
import nablarch.common.exclusivecontrol.OptimisticLockException;
import nablarch.common.exclusivecontrol.Version;

/**
 * リクエスト単体時には、リクエストパラメータに排他制御情報を記載しないようにするため、
 * 排他制御テーブルへの排他制御情報追加/削除以外は空実装となっているモック実装を提供する。
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
public class MockExclusiveControlManager implements ExclusiveControlManager {

    /**
     *
     */
    private ExclusiveControlManager delegate;

    @Override
    public Version getVersion(ExclusiveControlContext context) {
        return null;
    }

    @Override
    public void checkVersions(List<Version> versions) throws OptimisticLockException {
    }

    @Override
    public void updateVersionsWithCheck(List<Version> versions) throws OptimisticLockException {
    }

    @Override
    public void updateVersion(ExclusiveControlContext context) {
    }

    @Override
    public void addVersion(ExclusiveControlContext context) {
        delegate.addVersion(context);
    }

    @Override
    public void removeVersion(ExclusiveControlContext context) {
        delegate.addVersion(context);
    }

    public void setDelegate(ExclusiveControlManager delegate) {
        this.delegate = delegate;
    }
}
