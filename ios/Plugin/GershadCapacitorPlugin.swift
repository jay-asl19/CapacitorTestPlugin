import Foundation

@objc public class GershadCapacitorPlugin: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
