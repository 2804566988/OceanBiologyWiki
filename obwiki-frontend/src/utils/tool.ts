export class Tool {

  public static customSerializer(obj: any) {
    const seen = new WeakSet();
    return JSON.stringify(obj, (key, value) => {
        if (typeof value === 'object' && value !== null) {
            if (seen.has(value)) {
                return undefined; // 或者返回其他占位符
            }
            seen.add(value);
        }
        return value;
    });
}

  /**
   * 空校验 null或""都返回true
   */
  public static isEmpty (obj: any) {
    if ((typeof obj === 'string')) {
      return !obj || obj.replace(/\s+/g, "") === ""
    } else {
      //return (!obj || JSON.stringify(obj) === "{}" || obj.length === 0);
      return (!obj || Tool.customSerializer(obj) === "{}" || obj.length === 0);
    }
  }

  /**
   * 非空校验
   */
  public static isNotEmpty (obj: any) {
    return !this.isEmpty(obj);
  }

  /**
   * 对象复制
   * @param obj
   */
  public static copy (obj: object) {
    if (Tool.isNotEmpty(obj)) {
      //return JSON.parse(JSON.stringify(obj));
      return JSON.parse(Tool.customSerializer(obj));
    }
  }

  /**
   * 使用递归将数组转为树形结构
   * 父ID属性为parent
   */
  public static array2Tree (array: any, parentId: number) {
    if (Tool.isEmpty(array)) {
      return [];
    }
    const result = [];
    for (let i = 0; i < array.length; i++) {
      const c = array[i];
       console.log(String(c.parent), String(parentId));
      if (String(c.parent) === String(parentId)) {
        result.push(c);

        // 递归查看当前节点对应的子节点
        const children = Tool.array2Tree(array, c.id);
        if (Tool.isNotEmpty(children)) {
          c.children = children;
        }
      }
    }
    return result;
  }

  /**
   * 随机生成[len]长度的[radix]进制数
   * @param len
   * @param radix 默认62
   * @returns {string}
   */
  public static uuid (len: number, radix = 62) {
    const chars = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'.split('');
    const uuid = [];
    radix = radix || chars.length;

    for (let i = 0; i < len; i++) {
      uuid[i] = chars[0 | Math.random() * radix];
    }

    return uuid.join('');
  }
}
